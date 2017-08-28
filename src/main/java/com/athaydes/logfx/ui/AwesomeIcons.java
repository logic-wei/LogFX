package com.athaydes.logfx.ui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Mapping of unicode characters to AwesomeIcons.
 * <p>
 * See http://www.jensd.de/wordpress/?p=132
 * And http://fontawesome.io/
 */
public class AwesomeIcons {

    private AwesomeIcons() {
        // hide it
    }

    public static Button createIconButton( String iconName ) {
        return createIconButton( iconName, "", 16 );
    }

    public static Button createIconButton( String iconName, String text ) {
        return createIconButton( iconName, text, 16 );
    }

    public static Button createIconButton( String iconName, int iconSize ) {
        return createIconButton( iconName, "", iconSize );
    }

    public static Button createIconButton( String iconName, String text, int iconSize ) {
        Label icon = createIconLabel( iconName );
        icon.setStyle( "-fx-font-size: " + iconSize + "px;" );
        return new Button( text, icon );
    }

    public static Label createIconLabel( String iconName, String style ) {
        Label label = new Label( iconName );
        label.setStyle( style );
        return label;
    }

    public static Label createIconLabel( String iconName ) {
        return createIconLabel( iconName, 16 );
    }

    public static Label createIconLabel( String iconName, int iconSize ) {
        Label label = new Label( iconName );
        label.setStyle( "-fx-font-size: " + iconSize + "px;" );
        label.getStyleClass().add( "icons" );
        return label;
    }

    public static String CLOSE = "\uf2d4";

}