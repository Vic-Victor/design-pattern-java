package com.github.tonydeng.desgin.command.fs.impl;

import com.github.tonydeng.desgin.command.fs.FileSystemReceiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tonydeng on 15/9/27.
 */
public class WindowsFileSystemReceiver implements FileSystemReceiver {
    private static final Logger log = LoggerFactory.getLogger(WindowsFileSystemReceiver.class);

    @Override
    public void openFile() {
        log.info("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        log.info("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        log.info("Closing file in Windows OS");
    }
}
