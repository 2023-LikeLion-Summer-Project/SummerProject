import React, { useState } from "react";
import Header from "../components/header";
import "../routes/nextScree.css";
import calendar from "../img/calendar.png";
import { useNavigate } from "react-router-dom";

function Screen() {
  const navigate = useNavigate();

  const oonClick = () => {
    navigate("/check");
  };

  const [editing, setEditing] = useState(false);

  const [text, setText] = useState("제목을 작성해주세요");

  const handleClick = () => {
    setEditing(true);
  };
  const handleChange = (event) => {
    setText(event.target.value);
  };

  return (
    <div>
      <Header />
      <div className="leftcontainer">
        <div className="textBoxx">
          <h2 id="one">01 Pick</h2>
          <h2 id="two">02 Memo</h2>
          <h2 id="three">03 Check</h2>
        </div>
        {/* <div className="verticalLine"></div> */}
      </div>
      <div className="rightcontainerr">
        <div className="memoBox">
          <div id="memotext">
            <div className="memoTextt">Memo</div>
            <div className="linee"></div>
            <div className="nextLeftContainer">
              <div>
                <h2>Title</h2>
              </div>
              <div>
                <h2>Date</h2>
              </div>
              <div>
                <h2>Time</h2>
              </div>
              <div>
                <h2>Place</h2>
              </div>
              <div>
                <h2>With</h2>
              </div>
              <div>
                <h2>Record</h2>
              </div>
            </div>
            <div className="nextRightContainer">
              <div className="Title">
                <div className="Title" onClick={handleClick}>
                  {editing ? (
                    <input
                      className="Title"
                      type="text"
                      value={text}
                      onChange={handleChange}
                    />
                  ) : (
                    <span>{text}</span>
                  )}
                </div>
              </div>
              <div className="Date">
                <input id="date" placeholder="날짜를 입력해주세요."></input>
                <img className="calendar" src={calendar} alt="cal"></img>
              </div>
              <div className="Time">
                <p>시간을 입력해주세요.</p>
              </div>
              <div>
                <p>방문했던 장소를 기록해주세요.</p>
              </div>
              <div>
                <p>함께간 사람들을 기록해보세요.</p>
              </div>
              <div className="largest">:</div>
              <div className="largebar"></div>
              <div className="Confirm">
                <div>
                  <button onClick={oonClick}>확인</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Screen;
