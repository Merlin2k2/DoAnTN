package com.BMT_Shop.mapper.authentication;

import com.BMT_Shop.dto.authentication.RoleRequest;
import com.BMT_Shop.dto.authentication.RoleResponse;
import com.BMT_Shop.entity.authentication.Role;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends GenericMapper<Role, RoleRequest, RoleResponse> {
}
