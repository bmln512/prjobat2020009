package com.example.prjobat2020009.app
import com.example.prjobat2020009.model.BarangModel
import com.example.prjobat2020009.model.ResponModel
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @FormUrlEncoded
    @POST("tblproduk/save")
    fun saveBarang(
        @Body data: BarangModel,
    ):Call<ResponModel>
    @GET ("obat")
    fun getBarang():Call<ResponModel>
}