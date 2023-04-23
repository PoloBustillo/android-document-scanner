package io.polobustillo.documentscanner.constants

/**
 * This class contains default document scanner options
 */
class DefaultSetting {
    companion object {
        const val CROPPED_IMAGE_QUALITY = 100
        const val LET_USER_ADJUST_CROP = true
        const val MIN_NUM_DOCUMENTS = 1
        const val MAX_NUM_DOCUMENTS = 24
        val LABELS_DOCUMENTS: ArrayList<String> = arrayListOf()
        const val RESPONSE_TYPE = ResponseType.IMAGE_FILE_PATH
    }
}