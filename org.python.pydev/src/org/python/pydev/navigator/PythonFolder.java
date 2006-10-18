package org.python.pydev.navigator;

import org.eclipse.core.resources.IFolder;

public class PythonFolder extends WrappedResource<IFolder> {

    public PythonFolder(Object parentElement, IFolder folder, PythonSourceFolder pythonSourceFolder) {
		super(parentElement, folder, pythonSourceFolder, IWrappedResource.RANK_PYTHON_FOLDER);
    }


}
