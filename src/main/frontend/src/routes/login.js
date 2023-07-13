import React, { useState, useEffect, useRef } from "react";
import axios from "axios";
import "./login.css";
import Header from "../components/header";
import Layout from "../components/layout";
import { useNavigate } from "react-router-dom";

const LogIn = () => {
  const REST_API_KEY = "27a229e3d0e076567b75011e231c7cda";
  const REDIRECT_URI = "http://localhost:8080/add/kakao/permission";
  const KAKAO_AUTH_URL = `https://kauth.kakao.com/oauth/authorize?client_id=${REST_API_KEY}&redirect_uri=${REDIRECT_URI}&response_type=code`;

  const KakaoLoginPage = () => {
    window.location.href = KAKAO_AUTH_URL;
  };

  const navigate = useNavigate();
  const GotoMain = () => {
    navigate("/main");
  };

  const LostPw = () => {
    navigate("/lostpw");
  };

  const [ScrollY, setScrollY] = useState(0);
  const [ScrollActive, setScrollActive] = useState(false);

  const handleScroll = () => {
    if (ScrollY > 120) {
      setScrollY(window.scrollY);
      setScrollActive(true);
    } else {
      setScrollY(window.scrollY);
      setScrollActive(false);
    }
  };

  useEffect(() => {
    function scrollListener() {
      window.addEventListener("scroll", handleScroll);
    } //  window 에서 스크롤을 감시 시작
    scrollListener(); // window 에서 스크롤을 감시
    return () => {
      window.removeEventListener("scroll", handleScroll);
    }; //  window 에서 스크롤을 감시를 종료
  });

  return (
    <>
      <Header ScrollActive={ScrollActive} />
      <Layout>
        <div className="parent_div">
          <div className="main_name">
            <h1 className="ftext">logoipsum</h1>
            <h4 className="slogan">우리의 네컷사진을 마음껏 뽐내보세요!</h4>
          </div>
          <div className="loginbox">
            <h1>Sign in</h1>
            <div className="inputbox">
              <input type="email" placeholder="아이디(이메일)"></input>
            </div>
            <div className="inputbox">
              <input type="password" placeholder="비밀번호"></input>
            </div>
            <button className="lostpwbtn" onClick={LostPw}>
              비밀번호 찾기
            </button>
            <div className="loginbtns">
              <button className="loginbtn" onClick={GotoMain}>
                Login
              </button>
            </div>
            <div className="loginbtns">
              <button className="kakaobtn" onClick={KakaoLoginPage}>
                카카오 로그인
              </button>
            </div>
          </div>
        </div>
      </Layout>
    </>
  );
};

export default LogIn;
