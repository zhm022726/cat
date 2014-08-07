package com.dianping.cat.report.page.alert;

import org.unidal.web.mvc.view.BaseJspViewer;

import com.dianping.cat.report.ReportPage;

public class JspViewer extends BaseJspViewer<ReportPage, Action, Context, Model> {
	@Override
	protected String getJspFilePath(Context ctx, Model model) {
		Action action = model.getAction();

		switch (action) {
		case ALERT:
			return JspFile.ALERT.getPath();
		}

		throw new RuntimeException("Unknown action: " + action);
	}
}
