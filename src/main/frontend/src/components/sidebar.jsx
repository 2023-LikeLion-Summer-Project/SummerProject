import React from "react";
import { Link } from "react-router-dom";
import SidebarItem from "./sidebarItem";
import styled from "styled-components";

function Sidebar() {
  const menus = [
    { name: "Profile", path: "/" },
    { name: "Folder", path: "/" },
    { name: "Scrap", path: "/" },
  ];

  return (
    <Sidebars>
      {menus.map((menu, index) => {
        return (
          <Link to={menu.path} key={index} style={{ textDecoration: "none" }}>
            <SidebarItem menu={menu} />
          </Link>
        );
      })}
    </Sidebars>
  );
}

export default Sidebar;

const Sidebars = styled.div`
  float: left;
  width: 18vw;
  height: 100vh;
  padding-top: 90px;
`;
