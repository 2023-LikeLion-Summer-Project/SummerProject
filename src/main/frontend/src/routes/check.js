import Header from "../components/header";
import React, { useState } from "react";
import Picture from "../img/cutPicture.png";
import "../routes/check.css";
import unknown from "./img/unknown.png";
function Check() {
  const imageData = localStorage.getItem("file");

  return (
    <div>
      <Header />
      <div className="leftcontainer">
        <div className="textBoxx">
          <h2 id="one">01 Pick</h2>
          <h2 id="two">02 Memo</h2>
          <h2 id="three">03 Check</h2>
        </div>
        <div className="verticalLine"></div>
      </div>
      <div className="Rrightcontainer">
        <div className="unknwon">
          <img className="unkwon2" src={unknown} alt="pic"></img>
        </div>
        <div className="pictureee">
          <img src={Picture} alt="pic"></img>
        </div>
      </div>
    </div>
  );
}

export default Check;
