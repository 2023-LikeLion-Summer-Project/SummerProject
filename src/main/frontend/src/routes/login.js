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
            <input type="email" placeholder="아이디(이메일)"></input>
          </div>
        </div>
      </Layout>
    </>
  );
};

export default LoginPage;
