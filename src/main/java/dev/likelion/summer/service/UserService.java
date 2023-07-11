package dev.likelion.summer.service;

import dev.likelion.summer.dto.UserDto;
import dev.likelion.summer.entity.User;
import dev.likelion.summer.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Getter
@Setter
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long addUser(UserDto userDto) {
        User user = userRepository.save(User.toUser(userDto));
        return user.getUserId();
    }

    @Transactional
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Transactional
    public Long updateUserId(Long id, UserDto userDto) {
        User user = userRepository.getById(id);

        user.setEmail(userDto.getEmail());
        user.setSentence(userDto.getSentence());
        user.setNickName(userDto.getNickName());

        return id;
    }

    @Transactional
    public User getUserById(Long id) {
        User getUser = userRepository.getById(id);

        return getUser;
    }
}
