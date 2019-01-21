package controllers;

import mgr.StaffRoomMgr;
import play.libs.F.Promise;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import java.util.Map;

public class StaffRoomController extends Controller {

    private StaffRoomMgr mgr = new StaffRoomMgr();

    public Promise<Result> getPeriodDetails(String periodId, String teacherId, String classId) {

        Map<String, Object> response = mgr.getPeriodDetails(periodId, teacherId, classId);
        return Promise.<Result>pure(Results.ok(Json.toJson(response)).as("application/json"));
    }


    public Promise<Result> getAttendaceDetails(String periodId, String teacherId, String date, String classId) {

        Map<String, Object> response = mgr.getAttendanceDetails(periodId, teacherId, date, classId);
        return Promise.<Result>pure(Results.ok(Json.toJson(response)).as("application/json"));
    }

}
