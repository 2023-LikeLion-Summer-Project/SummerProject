import React from "react";
import "./header.css";

const Header = () => {
  return (
    <>
      <header className="header">
        <div className="contents">
          <div className="name">logoipsum</div>
          <div className="navigation">
            <h4 className="item">Home</h4>
            <h4 className="item">Archive</h4>
            <h4 className="item">Profile</h4>
          </div>
        </div>
      </header>
    </>
  );
};

export default Header;
