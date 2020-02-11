//  Copyright 2020 Christian Schmitz
//  SPDX-License-Identifier: Apache-2.0

package xyz.tynn.buildsrc.publishing;

import com.android.build.gradle.LibraryPlugin;
import com.android.build.gradle.api.LibraryVariant;

import org.gradle.api.Action;

import javax.annotation.Nonnull;

final class PluginAction implements Action<LibraryPlugin> {

    private final ProjectContext context;
    private final Action<ProjectContext> action;

    PluginAction(ProjectContext context, Action<ProjectContext> action) {
        this.context = context;
        this.action = action;
    }

    @Override
    public void execute(@Nonnull LibraryPlugin plugin) {
        action.execute(context);
    }
}
