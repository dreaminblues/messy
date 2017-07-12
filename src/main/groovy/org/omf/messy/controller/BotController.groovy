package org.omf.messy.controller

import org.omf.messy.service.BotService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

@RestController
@RequestMapping('/')
class BotController {

    @Resource(name = 'messyBotService')
    private BotService botService

    @GetMapping('/auth')
    Object auth() {
        botService.auth()
    }

    @PostMapping('/update')
    Object update() {
        botService.update()
    }

}
