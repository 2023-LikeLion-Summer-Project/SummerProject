import React from "react";
import styled from "styled-components";

// import { useDispatch } from "react-redux";
// import { actionCreators as userAction } from "../redux/modules/user";
// import Spinner from "../element/Spinner";

// const KakaoAuthHandler = (props) => {
//   const dispatch = useDispatch();

//   let code = new URL(window.location.href).searchParams.get("code");

//   React.useEffect(() => {
//     dispatch(userAction.kakaoLoginAC(code));
//   }, []);

//   return (
//     <Wrap>
//       <Spinner />
//     </Wrap>
//   );
// };

// const Wrap = styled.div`
//   margin-top: 50px;
//   min-height: 1100px;
// `;

// export default KakaoAuthHandler;

const Testing = () => {
  return (
    <>
      <Text>카카오로그인테스팅</Text>
    </>
  );
};

const Text = styled.h1`
  color: white;
`;

export default Testing;
