import React from "react";
import { Route, Routes } from "react-router-dom";
import Main from "./routes/main";
import Login from "./routes/login";

const App = () => {
  return (
    <Routes>
      <Route path={"/main"} element={<Main />} />
      <Route path={"/Login"} element={<Login />} />
    </Routes>
  );
};

export default App;
