package io.polobustillo.documentscanner.constants

/**
 * This class contains constants meant to be used as intent extras
 */
class DocumentScannerExtra {
    companion object {
        const val EXTRA_CROPPED_IMAGE_QUALITY = "croppedImageQuality"
        const val EXTRA_LET_USER_ADJUST_CROP = "letUserAdjustCrop"
        const val EXTRA_MAX_NUM_DOCUMENTS = "maxNumDocuments"
        const val EXTRA_MIN_NUM_DOCUMENTS = "minNumDocuments"
        const val EXTRA_LABELS_DOCUMENTS = "labelsDocuments"
    }
}