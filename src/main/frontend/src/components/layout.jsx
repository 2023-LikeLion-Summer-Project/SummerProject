import React from "react";
import styled from "styled-components";

const Wrapper = styled.div`
  padding: 75px 30px 0px 30px;
`;
const Layout = ({ children }) => <Wrapper>{children}</Wrapper>;

export default Layout;
