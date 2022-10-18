package vip.itsweets.ui;

import io.qt.core.*;
import io.qt.widgets.QWidget;

public class aDriveBasic extends QWidget
{

    private UI_aDriveBasic ui;

    public aDriveBasic()
    {
        ui = new UI_aDriveBasic();
        ui.setupUi(this);

        QFile driveBasicStyleFile = new QFile(":/style/aDriveBasic.qss");
        driveBasicStyleFile.open(QIODevice.OpenModeFlag.ReadOnly);
        setStyleSheet(String.valueOf(driveBasicStyleFile.readAll()));
        //ui.aDriveClose.setStyleSheet(String.valueOf(driveBasicStyleFile.readAll()));
        System.out.println(ui.aDriveClose.styleSheet());
        driveBasicStyleFile.close();
    }


}
