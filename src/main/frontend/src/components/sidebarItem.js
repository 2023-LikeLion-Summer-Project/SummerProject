import React from "react";
import styled from "styled-components";

function SidebarItem({ menu }) {
  return (
    <SidebarItemBox>
      <Item>{menu.name}</Item>
    </SidebarItemBox>
  );
}

export default SidebarItem;

const SidebarItemBox = styled.div`
  padding-left: 30px;
`;

const Item = styled.div`
  padding-bottom: 30px;
  color: #fff;
  font-size: 30px;
  font-style: normal;
  font-weight: 500;
  line-height: normal;
  letter-spacing: 0.46px;
`;
