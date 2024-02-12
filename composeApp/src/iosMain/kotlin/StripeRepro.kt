import cocoapods.StripePaymentsUI.STPPaymentCardTextField
//import cocoapods.StripePaymentsUI.STPSetupIntentConfirmParams <-- Does not work
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
class StripeRepro() {
    // From StripePaymentsUI package- works and imports correctly
    val paymentsUIField = STPPaymentCardTextField()

    // From StripePayments package- does NOT import correctly
//    val paymentsField = STPSetupIntentConfirmParams()
}