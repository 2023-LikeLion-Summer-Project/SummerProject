import React from "react";
import Header from "../components/header";
import Layout from "../components/layout";
import styled from "styled-components";
import datalist from "../tempdata/photo.json";

const archive = () => {
  return (
    <>
      <Header />
      <Layout>
        <Text>Archive Page</Text>
      </Layout>
    </>
  );
};

export default archive;

const Text = styled.div`
  display: block;
  margin: 0 auto;
  color: white;
`;
