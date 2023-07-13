import React, { useState } from "react";
import styled from "styled-components";

function PostList() {
  const jsonData = {
    spacepic: {
      content: "스페이스픽은 계속됩니닷",
      location: "이디야 양덕점",
      image: "/img/img1.png",
      date: "07/13/2023",
    },
    아이유너무이뻥: {
      content: "아이유이뻐요",
      location: "서울",
      image: "/img/img2.png",
      date: "05/16/2023",
    },
    아이유너무이뻥2: {
      content: "설명3",
      location: "서울",
      image: "/img/img3.png",
      date: "05/16/2023",
    },
    누군진모르지만이뻐: {
      content: "설명4",
      location: "서울",
      image: "/img/img4.png",
      date: "03/27/2023",
    },
  };

  return (
    <div>
      {Object.keys(jsonData).map((postKey) => (
        <Box key={postKey}>
          <ContainerBox src={jsonData[postKey].image} />
          <Title>{postKey}</Title>
          <Info>{jsonData[postKey].location}</Info>
          <Info>{jsonData[postKey].date}</Info>
        </Box>
      ))}
    </div>
  );
}

export default PostList;

const ContainerBox = styled.img`
  width: 250px;
  height: 330px;
  z-index: 0;
  align-items: center;
  color: black;
  position: relative;
`;

const Box = styled.div`
  display: inline-block;
  justify-content: space-evenly;
  text-align: left;
  margin: 20px;
`;

const Title = styled.h2`
  color: #fff;
  font-size: 30px;
  font-style: normal;
  font-weight: 400;
  line-height: normal;
`;

const Info = styled.p`
  color: #fff;
  font-size: 18px;
  font-style: normal;
  font-weight: 450;
  line-height: normal;
  letter-spacing: 0.2px;
`;
