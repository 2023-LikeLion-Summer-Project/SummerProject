import React from "react";
import Header from "../components/header";
import "../routes/nextScree.css";

function Screen() {
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
      <div className="rightcontainer">
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
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Screen;
