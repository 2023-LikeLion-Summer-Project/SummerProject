import React from "react";
import { Route, Routes } from "react-router-dom";
import Main from "./routes/main";
import Login from "./routes/login";
import Write from "./routes/write";
import Next from "./routes/nextScreen";

const App = () => {
  return (
    <Routes>
      <Route path={"/main"} element={<Main />} />
      <Route path={"/Login"} element={<Login />} />
      <Route path={"/write"} element={<Write />} />
      <Route path="/nextScreen" element={<Next />} />
    </Routes>
  );
};

export default App;
