package io.File;

import model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
