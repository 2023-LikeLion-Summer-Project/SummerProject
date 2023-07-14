import React, { useState } from "react";
import Header from "../components/header";
import "../routes/write.css";
import { useNavigate } from "react-router-dom";

function Write() {
  const [fileSrc, setFileSrc] = useState(null);

  const navigate = useNavigate();
  const reader = new FileReader();

  reader.onloadend = () => {
    setFileSrc(reader.result);
    navigate("/nextScreen");
  };

  const handleFileInput = (event) => {
    const file = event.target.files[0];

    console.log(file);
    reader.readAsDataURL(file);
    if (file) {
      const reader = new FileReader();

      reader.onload = () => {
        const imageData = reader.result;
        localStorage.setItem("imageData", imageData);
      };

      reader.readAsDataURL(file);
      const filee = URL.createObjectURL(file);
      console.log(filee);
    }
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
        <div className="verticalLine"></div>
      </div>
      <div className="rightcontainer">
        <div>
          <input type="file" onChange={handleFileInput} />
          {fileSrc && (
            <img src={fileSrc} alt="Selected" style={{ maxWidth: "100%" }} />
          )}
        </div>
      </div>
    </div>
  );
}

export default Write;
