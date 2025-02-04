package com.bwd4.mootd.common.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    EXAMPLE(HttpStatus.FORBIDDEN,"E001","예시"),

    // S3 Exception
    FAIL_UPLOAD_S3(HttpStatus.INTERNAL_SERVER_ERROR,"S3001","S3에 파일업로드 실패"),
    EMPTY_FILE(HttpStatus.BAD_REQUEST,"S3002","파일이 없습니다."),
    NO_FILE_EXTENTION(HttpStatus.BAD_REQUEST,"S3003","파일 확장자가 없습니다."),
    INVALID_FILE_EXTENTION(HttpStatus.BAD_REQUEST,"S3004","유효하지않은 확장자입니다"),
    FAIL_DELETE_S3(HttpStatus.INTERNAL_SERVER_ERROR,"S3005","S3에 파일삭제 실패"),
    RECENT_USAGE_NOT_FOUND(HttpStatus.NOT_FOUND,"R001","최근 사용한 이미지가 없습니다."),

    //base64, s3업로드관련
    INVALID_BASE64_DATA(HttpStatus.BAD_REQUEST, "B001","형태가 올바르지 않은 base64데이터입니다.")
    ;


    private final int statusCode;
    private final String code;
    private final String message;


    ErrorCode(HttpStatus statusCode, String code, String message) {
        this.statusCode = statusCode.value();
        this.code = code;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
