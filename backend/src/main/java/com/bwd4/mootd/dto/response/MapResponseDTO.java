package com.bwd4.mootd.dto.response;

public record MapResponseDTO(
        String photoId,
        String maskImageUrl,
        Double latitude,
        Double longitude
) {
}
