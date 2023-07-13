import React, { useState } from "react";
import Header from "../components/header";
import Layout from "../components/layout";
import styled from "styled-components";
import Datalist from "./datalist";
import Sidebar from "../components/sidebar";

const Archive = () => {
  return (
    <>
      <Header />
      <Sidebar />
      <Wrapper>
        <Datalist></Datalist>
      </Wrapper>
    </>
  );
};

export default Archive;

const Wrapper = styled.div`
  display: inline-flex;
  justify-content: space-evenly;
  padding-top: 75px;
  height: 100vh;
  width: 82vw;
  color: white;
`;
