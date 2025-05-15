package com.BMT_Shop.repository.client;

import com.BMT_Shop.entity.client.Wish;
import io.github.perplexhub.rsql.RSQLJPASupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface WishRepository extends JpaRepository<Wish, Long>, JpaSpecificationExecutor<Wish> {

    default Page<Wish> findAllByUsername(String username, String sort, String filter, Pageable pageable) {
        Specification<Wish> spec = RSQLJPASupport.toSpecification("user.username==" + username);

        if (filter != null && !filter.isBlank()) {
            spec = spec.and(RSQLJPASupport.toSpecification(filter));
        }

        if (sort != null && !sort.isBlank()) {
            spec = spec.and(RSQLJPASupport.toSort(sort)); // Hoặc xử lý sort trong PageRequest nếu có lỗi
        }

        return findAll(spec, pageable);
    }

    Optional<Wish> findByUser_IdAndProduct_Id(Long userId, Long productId);

}
