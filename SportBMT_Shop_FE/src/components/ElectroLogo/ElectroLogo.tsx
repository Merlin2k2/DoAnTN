import React from 'react';
// import { useMantineTheme } from '@mantine/core';

interface ElectroLogoProps {
  width?: number;
}

function ElectroLogo({ width = 130 }: ElectroLogoProps) {
  const imageUrl = '/image_logo.jpg';

  return <img src={imageUrl} width={width} alt='SportBMT Logo' style={{ marginTop: '50px' }} />;
}

export default ElectroLogo;
