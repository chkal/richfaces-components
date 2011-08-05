/*
 * JBoss, Home of Professional Open Source
 * Copyright , Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.component;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

public interface NotifyAttributes {

    @Attribute(description = @Description("If true, notification have to be closed manually"))
    boolean isSticky();

    void setSticky(boolean sticky);

    @Attribute(description = @Description("Defines how long will notification stay displayed after appearing"))
    Integer getStayTime();

    void setStayTime(Integer time);

    @Attribute(hidden = true, description = @Description("Defines the delay between document being ready and displaying notifications"))
    Integer getDelay();

    void setDelay(Integer delay);

    @Attribute
    String getStyleClass();

    void setStyleClass(String styleClass);

    @Attribute(hidden = true, description = @Description("Defines the type of animation used when message appears"))
    String getAppearAnimation();

    void setAppearAnimation(String appearAnimation);

    @Attribute(hidden = true, description = @Description("Defines the type of animation used when message disappears"))
    String getHideAnimation();

    void setHideAnimation(String hideAnimation);

    @Attribute(hidden = true, description = @Description("Defines the speed of animations"))
    Integer getAnimationSpeed();

    void setAnimationSpeed(Integer animationSpeed);

    @Attribute(defaultValue = "false", hidden = true, description = @Description("Defines whetever history of notifications can be displayed"))
    boolean isShowHistory();

    void setShowHistory(boolean showHistory);

    @Attribute(description = @Description("Defines whetever the notification should fade when hovering and allow to click elements behind"))
    boolean isNonblocking();

    void setNonblocking(boolean nonblocking);

    @Attribute(description = @Description("Defines whetever the shadow under notification should be displayed"))
    boolean isShowShadow();

    void setShowShadow(boolean showShadow);

    @Attribute(defaultValue = "true", description = @Description("Defines whetever close button should be displayed"))
    boolean isShowCloseButton();

    void setShowCloseButton(boolean showCloseButton);

    @Attribute(description = @Description("Defines opacity of non-blocking notifications"))
    Double getNonblockingOpacity();

    void setNonblockingOpacity(Double nonblockingOpacity);

    @Attribute(description = @Description("Defines which stack will be notification bound to"))
    String getStack();

    void setStack(String stack);
}
