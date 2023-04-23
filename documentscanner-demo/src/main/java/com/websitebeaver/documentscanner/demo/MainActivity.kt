package io.polobustillo.documentscanner.demo

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import io.polobustillo.documentscanner.DocumentScanner
import io.polobustillo.documentscanner.constants.ResponseType
import io.polobustillo.documentscanner.utils.ImageUtil

/**
 * A demo showing how to use the document scanner
 *
 * @constructor creates demo activity
 */
class MainActivity : AppCompatActivity() {
    /**
     * @property croppedImageView the cropped image view
     */
    private lateinit var croppedImageView: ImageView

    /**
     * @property documentScanner the document scanner
     */
    private val documentScanner = DocumentScanner(
        this,
        { croppedImageResults ->
            // display the first cropped image
            croppedImageView.setImageBitmap(
                ImageUtil().readBitmapFromFileUriString(
                    croppedImageResults.first(),
                    contentResolver
                )
            )
        },
        {
            // an error happened
                errorMessage -> Log.v("documentscannerlogs", errorMessage)
        },
        {
            // user canceled document scan
            Log.v("documentscannerlogs", "User canceled document scan")
        }, ResponseType.IMAGE_FILE_PATH, true,2, 2, 100, arrayListOf<String>("FRENTE DEL INE MUCHO TEXTO TEJAJSDAJSD","asdasdasdasASKDSAKDKASD ASD ASDLAS")
    )

    /**
     * called when activity is created
     *
     * @param savedInstanceState persisted data that maintains state
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // cropped image
        croppedImageView = findViewById(R.id.cropped_image_view)

        // start document scan
        documentScanner.startScan()
    }
}