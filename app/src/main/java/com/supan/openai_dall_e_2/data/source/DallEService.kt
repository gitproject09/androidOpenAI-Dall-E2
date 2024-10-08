package com.supan.openai_dall_e_2.data.source

import com.supan.openai_dall_e_2.common.Constants.GENERATE_IMAGE
import com.supan.openai_dall_e_2.data.model.GeneratedImage
import com.supan.openai_dall_e_2.data.model.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface DallEService {

    @POST(GENERATE_IMAGE)
    suspend fun generateImage(@Body body: RequestBody): GeneratedImage

}