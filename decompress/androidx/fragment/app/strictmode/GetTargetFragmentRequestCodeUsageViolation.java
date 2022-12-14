// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001?\u0006\u0002" }, d2 = { "Landroidx/fragment/app/strictmode/GetTargetFragmentRequestCodeUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "fragment_release" }, k = 1, mv = { 1, 6, 0 })
public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation
{
    public GetTargetFragmentRequestCodeUsageViolation(final Fragment fragment) {
        czd.f((Object)fragment, "fragment");
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to get target request code from fragment ");
        sb.append(fragment);
        super(fragment, sb.toString());
    }
}
