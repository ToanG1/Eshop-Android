package com.nguyenvansapplication.app.network.services.User

import com.nguyenvansapplication.app.network.models.User.ListAddressResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface AddressApi {
  @POST("/api/user/user/address")
  fun getAddressByUid(@Body body: Map<String, String>) : Call<ListAddressResponse>

  @POST("/api/user/user/address/create")
  fun createAddress(@Body body: Map<String, String>) : Call<Unit>

  @PUT("/api/user/user/address")
  fun updateAddress(@Body body: Map<String, String>) : Call<Unit>

  @DELETE("/api/user/user/address/{uid}")
  fun deleteAddress(@Path("uid") uid: String, @Query("id") id: Long) : Call<Unit>
}