import accountLogo from "./img/accountCircle.png";
import React from "react";
import "../routes/main.css";
// import spacepic from "./img/spacepic2.png
import { useNavigate } from "react-router-dom";
import vector from "./img/vector.png";
import Header from "../components/header";

function Main() {
  const navigatee = useNavigate();

  const onCclick = () => {
    navigatee("/write");
  };
  return (
    <div className="container">
      <Header />
      <div className="leftcontainer">
        <div className="leftText">
          <p id="logoT">
            <strong>logoipsum</strong>
          </p>
          <span id="text2">
            우리의 네컷사진을 <br />
            마음껏 뽐내보아요!
          </span>
        </div>
      </div>
      <div onClick={onCclick} className="rightcontainer">
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>

        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>

        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
        <div className="containerBox">
          <div className="containerBox2">
            <img className="vector" alt="vector" src={vector}></img>
            <div className="underText">
              <p id="underText">텍스트를 작성할 수 있습니다. (10자 내외)</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Main;
