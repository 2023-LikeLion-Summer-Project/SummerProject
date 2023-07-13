import React from "react";
import styled from "styled-components";
import logo from "../img/spacepic2.png";
import profile from "../img/profilepic.png";
import { useNavigate } from "react-router-dom";

export default function Header({ ScrollActive }) {
  const navigate = useNavigate();
  const toArchive = () => {
    navigate("/archive");
  };

  const toMain = () => {
    navigate("/main");
  };

  return (
    <Positioner className={ScrollActive ? "flexible" : null}>
      <HeaderContents>
        <Logo src={logo}></Logo>
        <Spacer />
        <Button onClick={toMain}>Home</Button>
        <Button onClick={toArchive}>Archive</Button>
        <Profile src={profile}></Profile>
      </HeaderContents>
    </Positioner>
  );
}

// 상단 고정, 그림자
const Positioner = styled.div`
  display: flex;
  flex-direction: column;
  position: absolute;
  top: 35px;
  // left: calc(50vw - 600px);
  width: 100%;
  padding: 0px;
  border: 0px;

  z-index: 99;

  &.flexible {
    position: fixed;
  }
`;

const HeaderContents = styled.div`
  display: flex;
  width: 100%;
  max-width: 1500px;
  height: 100%;
  margin: auto;
  justify-content: space-between;
`;

const Logo = styled.img`
  height: 30px;
`;

const Profile = styled.img`
  margin-left: 20px;
  margin-right: 20px;
  height: 30px;
  width: 30px;
`;
const Spacer = styled.div`
  flex-grow: 1;
`;

const Button = styled.button`
  margin-left: 20px;
  margin-right: 20px;
  font-size: 16px;
  font-style: normal;
  font-weight: 450;
  line-height: normal;
  letter-spacing: 0.2px;
  background-color: transparent;
  border: none;
  outline: none;
  color: white;
`;
