package com.maplonki.popularmovieskotlin.data.api.parsing

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by hugo on 2/18/18.
 */
class DateDeserializer : JsonDeserializer<Date> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Date {
        return try {
            val dateString = json!!.asString
            SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(dateString)
        } catch (pe: Exception) {
            pe.printStackTrace()
            Date(0)
        }

    }

}