// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Landroidx/fragment/app/strictmode/SetRetainInstanceUsageViolation;", "Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;", "fragment_release" }, k = 1, mv = { 1, 6, 0 })
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation
{
    public SetRetainInstanceUsageViolation(final Fragment fragment) {
        czd.f((Object)fragment, "fragment");
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to set retain instance for fragment ");
        sb.append(fragment);
        super(fragment, sb.toString());
    }
}
