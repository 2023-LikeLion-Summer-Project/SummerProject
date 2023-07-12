import React from "react";
import "./login.css";
import Header from "../components/header";
import Layout from "../components/layout";

const LoginPage = () => {
  return (
    <>
      <Layout>
        <div>
          <Header />
        </div>
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
            <button className="lostpwbtn">비밀번호 찾기</button>
            <div className="loginbtns">
              <button className="loginbtn">Login</button>
            </div>
            <div className="loginbtns">
              <button className="kakaobtn">카카오 로그인</button>
            </div>
          </div>
        </div>
      </Layout>
    </>
  );
};

export default LoginPage;
