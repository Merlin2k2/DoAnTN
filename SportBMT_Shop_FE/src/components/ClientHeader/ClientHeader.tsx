import {
  Badge,
  Button,
  Center,
  Container,
  createStyles,
  Group,
  Indicator,
  Menu,
  Popover,
  Stack,
  Text,
  TextInput,
  Tooltip,
  UnstyledButton,
  useMantineTheme
} from '@mantine/core';
import React, { useEffect, useRef, useState } from 'react';
import { ElectroLogo } from 'components';
import {
  Alarm,
  Award,
  Bell,
  FileBarcode,
  Fingerprint,
  Heart,
  List,
  Login,
  Logout,
  Search,
  Settings,
  ShoppingCart,
  Star,
  User,
  UserCircle
} from 'tabler-icons-react';
import { Link, useNavigate } from 'react-router-dom';
import CategoryMenu from 'components/ClientHeader/CategoryMenu';
import { useElementSize } from '@mantine/hooks';
import useAuthStore from 'stores/use-auth-store';
import NotifyUtils from 'utils/NotifyUtils';
import { useQuery } from 'react-query';
import FetchUtils, { ErrorMessage } from 'utils/FetchUtils';
import ResourceURL from 'constants/ResourceURL';
import {
  EventInitiationResponse,
  NotificationResponse
} from 'models/Notification';
import MiscUtils from 'utils/MiscUtils';
import useClientSiteStore from 'stores/use-client-site-store';

const useStyles = createStyles((theme) => ({
  header: {
    boxShadow: theme.shadows.sm,
    borderBottom: `1px solid ${
      theme.colorScheme === 'dark' ? theme.colors.dark[5] : theme.colors.gray[2]
    }`,
    marginBottom: theme.spacing.md * 2,
    backgroundColor:
      theme.colorScheme === 'dark' ? theme.colors.dark[8] : theme.white,
    position: 'sticky',
    top: 0,
    zIndex: 10,

    gap: '0px',
    flexDirection: 'row',
  },


  iconGroup: {
    backgroundColor:
      theme.colorScheme === 'dark'
        ? theme.colors.dark[6]
        : theme.colors.gray[0],
    borderRadius: theme.radius.md,

    '&:hover': {
      backgroundColor:
        theme.colorScheme === 'dark'
          ? theme.colors.dark[5]
          : theme.colors.gray[2],
      '~logo': {
        animation: 'fadeByFocus 0.5s ease-in-out forward',
      },
    },

    '&:active': {
      color: theme.white,
      backgroundColor:
        theme.colorScheme === 'dark'
          ? theme.colors.blue[8]
          : theme.colors.blue[6],
    },
  },

  logo: {
    position: 'absolute',
    zIndex: 1,
    marginLeft: 'calc(50% - 200px)',
  },
  group: {
    gap: '0px',
  },
}));

function ClientHeader() {
  const theme = useMantineTheme();
  const { classes } = useStyles();

  const [openedCategoryMenu, setOpenedCategoryMenu] = useState(false);

  const { ref: refHeaderStack, width: widthHeaderStack } = useElementSize();

  const { user, resetAuthState, currentTotalCartItems } = useAuthStore();

  // Search state & function
  const navigate = useNavigate();
  const [search, setSearch] = useState('');

  useNotificationEvents();

  const { newNotifications } = useClientSiteStore();

  const [disabledNotificationIndicator, setDisabledNotificationIndicator] =
    useState(true);

  useEffect(() => {
    if (newNotifications.length > 0) {
      setDisabledNotificationIndicator(false);
    }
  }, [newNotifications.length]);

  const handleSearchInput = (event: React.KeyboardEvent<HTMLInputElement>) => {
    if (event.key === 'Enter' && search.trim() !== '') {
      navigate('/search?q=' + search.trim());
    }
  };

  const handleSignoutMenu = () => {
    if (user) {
      resetAuthState();
      NotifyUtils.simpleSuccess('Đăng xuất thành công');
    }
  };

  const handleNotificationButton = () => {
    if (user) {
      setDisabledNotificationIndicator(true);
      navigate('/user/notification');
    } else {
      NotifyUtils.simple('Vui lòng đăng nhập để sử dụng chức năng');
    }
  };

  return (
    <header className={classes.header}>
      <Container size="xl">
        <Stack spacing={0} ref={refHeaderStack}>
          <Group
            position="apart"
            py={theme.spacing.md}
            className={classes.group}
          >
            <Center component={Link} to="/" className={classes.logo}>
              <ElectroLogo />
            </Center>
            <TextInput
              placeholder="Tìm kiếm sản phẩm..."
              variant="filled"
              size="md"
              radius="md"
              icon={<Search size={16} />}
              sx={{ width: 300 }}
              value={search}
              onChange={(event) => setSearch(event.currentTarget.value)}
              onKeyDown={handleSearchInput}
            />  
            <Group spacing="xs">
              {user && (
                <>
                  <Tooltip label="Giỏ hàng" position="bottom">
                    <UnstyledButton component={Link} to="/cart">
                      <Group
                        spacing="xs"
                        px={theme.spacing.sm}
                        py={theme.spacing.xs}
                        className={classes.iconGroup}
                      >
                        <ShoppingCart strokeWidth={1} />
                        <Text weight={500} size="sm">
                          {currentTotalCartItems}
                        </Text>
                      </Group>
                    </UnstyledButton>
                  </Tooltip>

                  <Tooltip label="Đơn hàng" position="bottom">
                    <UnstyledButton component={Link} to="/order">
                      <Group
                        spacing="xs"
                        px={theme.spacing.sm}
                        py={theme.spacing.xs}
                        className={classes.iconGroup}
                      >
                        <FileBarcode strokeWidth={1} />
                      </Group>
                    </UnstyledButton>
                  </Tooltip>
                </>
              )}

              <Tooltip label="Thông báo" position="bottom">
                <UnstyledButton onClick={handleNotificationButton}>
                  <Indicator
                    size={14}
                    color="pink"
                    withBorder
                    disabled={disabledNotificationIndicator}
                  >
                    <Group
                      spacing="xs"
                      px={theme.spacing.sm}
                      py={theme.spacing.xs}
                      className={classes.iconGroup}
                    >
                      <Bell strokeWidth={1} />
                    </Group>
                  </Indicator>
                </UnstyledButton>
              </Tooltip>

              <Menu
                placement="end"
                control={
                  <Tooltip label='Tài khoản' position="bottom">
                    <UnstyledButton>
                      <Group
                        spacing="xs"
                        px={theme.spacing.sm}
                        py={theme.spacing.xs}
                        className={classes.iconGroup}
                        sx={{
                          color: user?theme.colors.blue[theme.colorScheme === 'dark' ? 4 : 7]
                            :'inherit',
                        }}
                      >
                        <UserCircle strokeWidth={1} />
                      </Group>
                    </UnstyledButton>
                  </Tooltip>
                }
              >
                {user && (
                  <>
                    <Menu.Item
                      icon={<User size={14} />}
                      component={Link}
                      to="/user"
                    >
                      Tài khoản
                    </Menu.Item>
                    <Menu.Item
                      icon={<Settings size={14} />}
                      component={Link}
                      to="/user/setting"
                    >
                      Thiết lập
                    </Menu.Item>
                    <Menu.Item
                      icon={<Star size={14} />}
                      component={Link}
                      to="/user/review"
                    >
                      Đánh giá sản phẩm
                    </Menu.Item>
                    <Menu.Item
                      icon={<Heart size={14} />}
                      component={Link}
                      to="/user/wishlist"
                    >
                      Sản phẩm yêu thích
                    </Menu.Item>
                    <Menu.Item
                      icon={<Award size={14} />}
                      component={Link}
                      to="/user/reward"
                    >
                      Đăng xuất
                    </Menu.Item>
                  </>
                )}
                {!user && (
                  <>
                    <Menu.Item
                      icon={<Login size={14} />}
                      component={Link}
                      to="/signin"
                    >
                      Đăng nhập
                    </Menu.Item>
                    <Menu.Item
                      icon={<Fingerprint size={14} />}
                      component={Link}
                      to="/signup"
                    >
                      Đăng ký
                    </Menu.Item>
                  </>
                )}
              </Menu>
            </Group>
          </Group>
          <Group position="apart" mb="md">
            <Group spacing={theme.spacing.xs / 2}>
              <Popover
                opened={openedCategoryMenu}
                onClose={() => setOpenedCategoryMenu(false)}
                target={
                  <Button
                    onClick={() => setOpenedCategoryMenu((o) => !o)}
                    leftIcon={<List size={16} />}
                    radius='md'
                  >
                    Danh mục sản phẩm
                  </Button>
                }
                width={widthHeaderStack}
                position="bottom"
                placement="start"
                radius="md"
                shadow="md"
              >
                <CategoryMenu setOpenedCategoryMenu={setOpenedCategoryMenu} />
              </Popover>

            </Group>
            <Group spacing="xs">
              <Badge color="pink" size="xs" variant="filled">
                FreeShip
              </Badge>
              <Text size="sm" color="dimmed">
                Miễn phí giao hàng cho đơn hàng trên 500.000 đồng
              </Text>
            </Group>
          </Group>
        </Stack>
      </Container>
    </header>
  );
}

function useNotificationEvents() {
  const { user } = useAuthStore();

  const eventSourceRef = useRef<EventSource | null>(null);

  const { pushNewNotification } = useClientSiteStore();

  useQuery<EventInitiationResponse, ErrorMessage>(
    ['client-api', 'notifications/init-events', 'initNotificationEvents'],
    () => FetchUtils.getWithToken(ResourceURL.CLIENT_NOTIFICATION_INIT_EVENTS),
    {
      onSuccess: (response) => {
        const eventSource = new EventSource(
          `${ResourceURL.CLIENT_NOTIFICATION_EVENTS}?eventSourceUuid=${response.eventSourceUuid}`
        );

        eventSource.onopen = () =>
          MiscUtils.console.log('Opening EventSource of Notifications...');

        eventSource.onerror = () =>
          MiscUtils.console.error(
            'Encountered error with Notifications EventSource!'
          );

        eventSource.onmessage = (event) => {
          const notificationResponse = JSON.parse(
            event.data
          ) as NotificationResponse;
          pushNewNotification(notificationResponse);
        };

        eventSourceRef.current = eventSource;
      },
      onError: () => NotifyUtils.simpleFailed('Lấy dữ liệu không thành công'),
      refetchOnWindowFocus: false,
      keepPreviousData: true,
      enabled: !!user,
    }
  );

  useEffect(() => () => eventSourceRef.current?.close(), []);
}

export default React.memo(ClientHeader);
