package com.cloudbees.hr.onboarding;

import io.micronaut.http.annotation.*;

@Controller("/fastOnboarding")
public class FastOnboardingController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}