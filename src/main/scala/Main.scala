/**
  * @author yamadanaoyuki
  */
import com.kirishikistudios.com.adx.google.realtime_bidding.{BidRequest, BidResponse}
object Main extends App{
  val bidRequest = BidRequest.toString
  val bidResponse = BidResponse.toString

  println(bidRequest + bidResponse)
}
