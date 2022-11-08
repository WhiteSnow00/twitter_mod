// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safety.mutedkeywords.composer;

import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

public final class b
{
    public interface a
    {
        void o(final e94 p0);
    }
    
    public static final class b
    {
        public final View a;
        public final TextView b;
        public final RadioButton c;
        
        public b(final View a) {
            this.a = a;
            final View viewById = a.findViewById(2131428235);
            final int a2 = w4j.a;
            this.b = (TextView)viewById;
            this.c = (RadioButton)a.findViewById(2131428234);
        }
    }
}
