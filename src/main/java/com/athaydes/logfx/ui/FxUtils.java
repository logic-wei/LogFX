package com.athaydes.logfx.ui;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class FxUtils {

    private static final Map<Paint, Background> bkgByPaint = new HashMap<>();

    public static Background simpleBackground( Paint paint ) {
        return bkgByPaint.computeIfAbsent( paint,
                ignored -> new Background(
                        new BackgroundFill( paint, CornerRadii.EMPTY, Insets.EMPTY ) ) );
    }

}
