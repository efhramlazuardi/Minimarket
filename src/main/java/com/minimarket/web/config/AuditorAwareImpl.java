package com.minimarket.web.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Ambil nama pengguna yang sedang login
        return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getName());
    }
}
