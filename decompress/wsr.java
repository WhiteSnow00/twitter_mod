import java.util.Iterator;
import com.twitter.android.onboarding.core.common.OcfInvisibleSubtaskActivity;
import java.util.Objects;
import java.util.Collection;
import com.twitter.android.onboarding.core.showcode.ShowTextCodeSubtaskActivity;
import com.twitter.android.onboarding.core.showcode.ShowQrCodeSubtaskActivity;
import com.twitter.android.onboarding.core.enterdate.EnterDateSubtaskActivity;
import com.twitter.android.onboarding.core.sso.SsoSubtaskActivity;
import com.twitter.android.onboarding.core.webmodal.WebModalSubtaskActivity;
import com.twitter.android.onboarding.core.web.WebSubtaskActivity;
import com.twitter.android.onboarding.core.actionlist.ActionListActivity;
import com.twitter.android.onboarding.core.notifications.NotificationsPermissionPromptActivity;
import com.twitter.android.onboarding.core.location.LocationPermissionPromptActivity;
import com.twitter.android.onboarding.core.email.EnterEmailSubtaskActivity;
import com.twitter.android.onboarding.core.topicselector.TopicsSelectorActivity;
import com.twitter.android.onboarding.core.enterphone.EnterPhoneActivity;
import com.twitter.android.onboarding.core.choiceselection.ChoiceSelectionActivity;
import com.twitter.android.onboarding.core.media.SelectBannerSubtaskActivity;
import com.twitter.android.onboarding.core.media.SelectAvatarSubtaskActivity;
import com.twitter.android.onboarding.core.entertext.EnterTextSubtaskActivity;
import com.twitter.android.onboarding.core.settings.SettingsListSubtaskActivity;
import com.twitter.android.onboarding.core.common.CtaSubtaskActivity;
import com.twitter.android.onboarding.core.username.EnterUsernameActivity;
import com.twitter.android.onboarding.core.interestpicker.InterestPickerActivity;
import com.twitter.android.onboarding.core.userrecommendation.userrecommendationlist.UserRecommendationsListActivity;
import com.twitter.android.onboarding.core.signup.PrivacyOptionsActivity;
import com.twitter.android.onboarding.core.verification.EmailPinVerificationStepActivity;
import com.twitter.android.onboarding.core.verification.PhonePinVerificationStepActivity;
import com.twitter.android.onboarding.core.dialog.OcfDialogFragmentActivity;
import com.twitter.android.onboarding.core.signup.SignUpReviewStepActivity;
import com.twitter.android.onboarding.core.signup.SignUpStepFormActivity;
import com.twitter.android.onboarding.core.permissionstep.LiveSyncPermissionStepActivity;
import com.twitter.android.onboarding.core.password.PasswordEntryStepActivity;
import com.twitter.app.common.args.ContentViewArgs;
import java.util.Map;
import java.util.Set;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wsr implements ypa<acs, Intent>
{
    public final Context a;
    public final bn b;
    public final Set<szd$a<? extends ssr<? extends dtr>>> c;
    public final um6 d;
    public final Map<Class<? extends ssr<? extends dtr>>, ypa<? super ssr<? extends dtr>, ContentViewArgs>> e;
    
    public wsr(final Context a, final bn b, final Set<? extends szd$a<? extends ssr<? extends dtr>>> c, final um6 d, final Map<Class<? extends ssr<? extends dtr>>, ? extends ypa<? super ssr<? extends dtr>, ContentViewArgs>> e) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "activityArgsIntentFactory");
        czd.f((Object)c, "invisibleSubtaskMatchers");
        czd.f((Object)d, "intentFactory");
        this.a = a;
        this.b = b;
        this.c = (Set<szd$a<? extends ssr<? extends dtr>>>)c;
        this.d = d;
        this.e = (Map<Class<? extends ssr<? extends dtr>>, ypa<? super ssr<? extends dtr>, ContentViewArgs>>)e;
    }
    
    public final Object a(Object o) {
        final acs acs = (acs)o;
        czd.f((Object)acs, "taskContext");
        final ssr h = acs.h;
        if (this.e.containsKey(h.getClass())) {
            final ypa<? super ssr<? extends dtr>, ContentViewArgs> value = this.e.get(acs.h.getClass());
            czd.c((Object)value);
            o = value.a((Object)h);
            czd.e(o, "subtaskArgsFactoryMap[ta\u2026s.java]!!.create(subtask)");
            o = this.d.a(this.a, (ContentViewArgs)o);
        }
        else if (h instanceof tyj) {
            o = new Intent(this.a, (Class)PasswordEntryStepActivity.class);
        }
        else if (h instanceof e1g) {
            o = new Intent(this.a, (Class)LiveSyncPermissionStepActivity.class);
        }
        else if (h instanceof c7q) {
            o = new Intent(this.a, (Class)SignUpStepFormActivity.class);
        }
        else if (h instanceof q6q) {
            o = new Intent(this.a, (Class)SignUpReviewStepActivity.class);
        }
        else {
            final boolean b = h instanceof sw;
            boolean b2 = true;
            if (b || h instanceof vw || h instanceof m4h) {
                o = new Intent(this.a, (Class)OcfDialogFragmentActivity.class);
            }
            else if (h instanceof gck) {
                o = new Intent(this.a, (Class)PhonePinVerificationStepActivity.class);
            }
            else if (h instanceof zz9) {
                o = new Intent(this.a, (Class)EmailPinVerificationStepActivity.class);
            }
            else if (h instanceof i0l) {
                o = new Intent(this.a, (Class)PrivacyOptionsActivity.class);
            }
            else if (h instanceof ygw) {
                o = new Intent(this.a, (Class)UserRecommendationsListActivity.class);
            }
            else if (h instanceof gvd) {
                o = new Intent(this.a, (Class)InterestPickerActivity.class);
            }
            else if (h instanceof g6a) {
                o = new Intent(this.a, (Class)EnterUsernameActivity.class);
            }
            else if (h instanceof f77) {
                if (((g77)((ssr)h).b).o == 4) {
                    o = new Intent(this.a, (Class)OcfDialogFragmentActivity.class);
                }
                else {
                    o = new Intent(this.a, (Class)CtaSubtaskActivity.class);
                }
            }
            else if (h instanceof pop) {
                o = new Intent(this.a, (Class)SettingsListSubtaskActivity.class);
            }
            else if (h instanceof z5a) {
                o = new Intent(this.a, (Class)EnterTextSubtaskActivity.class);
            }
            else if (h instanceof scp) {
                o = new Intent(this.a, (Class)SelectAvatarSubtaskActivity.class);
            }
            else if (h instanceof zcp) {
                o = new Intent(this.a, (Class)SelectBannerSubtaskActivity.class);
            }
            else if (h instanceof n84) {
                o = new Intent(this.a, (Class)ChoiceSelectionActivity.class);
            }
            else if (h instanceof t5a) {
                o = new Intent(this.a, (Class)EnterPhoneActivity.class);
            }
            else if (h instanceof ntt) {
                o = new Intent(this.a, (Class)TopicsSelectorActivity.class);
            }
            else if (h instanceof q4a) {
                o = new Intent(this.a, (Class)EnterEmailSubtaskActivity.class);
            }
            else if (h instanceof a6g) {
                o = new Intent(this.a, (Class)LocationPermissionPromptActivity.class);
            }
            else if (h instanceof lxi) {
                final njl o2 = ((mxi)((ssr)h).b).o;
                int n;
                if (o2 == null) {
                    n = -1;
                }
                else {
                    n = wsr.wsr$a.a[((Enum)o2).ordinal()];
                }
                if (n != 1 && n != 2) {
                    o = new Intent(this.a, (Class)NotificationsPermissionPromptActivity.class);
                }
                else {
                    o = new Intent(this.a, (Class)OcfDialogFragmentActivity.class);
                }
            }
            else if (h instanceof mk) {
                o = new Intent(this.a, (Class)ActionListActivity.class);
            }
            else if (h instanceof amx) {
                if (wsr.wsr$a.b[((Enum)((cmx)((ssr)h).b).k).ordinal()] == 1) {
                    o = new Intent(this.a, (Class)WebSubtaskActivity.class);
                }
                else {
                    o = new Intent(this.a, (Class)WebModalSubtaskActivity.class);
                }
            }
            else if (h instanceof l5r) {
                o = new Intent(this.a, (Class)SsoSubtaskActivity.class);
            }
            else if (h instanceof l4a) {
                o = new Intent(this.a, (Class)EnterDateSubtaskActivity.class);
            }
            else if (h instanceof z3q) {
                if (((a4q)((ssr)h).b).j == x3q.E0) {
                    o = new Intent(this.a, (Class)ShowQrCodeSubtaskActivity.class);
                }
                else {
                    o = new Intent(this.a, (Class)ShowTextCodeSubtaskActivity.class);
                }
            }
            else {
                final Set<szd$a<? extends ssr<? extends dtr>>> c = this.c;
                Label_1034: {
                    if (!(c instanceof Collection) || !c.isEmpty()) {
                        for (final szd$a szd$a : c) {
                            Objects.requireNonNull(szd$a);
                            if (szd$a.a.isInstance(h)) {
                                break Label_1034;
                            }
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    o = new Intent(this.a, (Class)OcfInvisibleSubtaskActivity.class);
                }
                else {
                    final Class<? extends z3q> class1 = ((z3q)h).getClass();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Got unsupported subtask: ");
                    sb.append(class1);
                    cj1.h(sb.toString());
                    o = this.b.a(this.a, mfg.a(wfg.E0));
                }
            }
        }
        return o;
    }
}
