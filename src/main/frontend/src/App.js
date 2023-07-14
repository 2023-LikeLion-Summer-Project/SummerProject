import React from "react";
import { Route, Routes } from "react-router-dom";
import Main from "./routes/main";
import Login from "./routes/login";
import Write from "./routes/write";
import Next from "./routes/nextScreen";
import Testing from "./routes/KakaoLogin";
import LostPw from "./routes/lostpw";
import Archive from "./routes/archive";
import Check from "./routes/check";

const App = () => {
  return (
    <Routes>
      <Route path={"/main"} element={<Main />} />
      <Route path={"/check"} element={<Check />} />
      <Route path={"/Login"} element={<Login />} />
      <Route path={"/write"} element={<Write />} />
      <Route path="/nextScreen" element={<Next />} />
      <Route path="/KakaoLogin" element={<Testing />} />
      <Route path="/lostpw" element={<LostPw />} />
      <Route path="/archive" element={<Archive />} />
    </Routes>
  );
};

export default App;
