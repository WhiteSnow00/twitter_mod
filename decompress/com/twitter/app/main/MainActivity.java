// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.main;

import java.util.Collection;
import android.content.Context;
import android.view.Menu;
import android.view.KeyboardShortcutGroup;
import java.util.List;

public class MainActivity extends vmd
{
    public static final int o1 = 0;
    
    public final void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
        super.onProvideKeyboardShortcuts((List)list, menu, n);
        list.addAll(0, xqe.a((Context)this));
    }
}
