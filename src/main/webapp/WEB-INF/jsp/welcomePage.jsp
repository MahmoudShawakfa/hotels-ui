<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<form accept-charset="UTF-8" action="action_page.php" th:action="@{/welcomePage}" th:object="${filter}" autocomplete="off" method="POST" target="_blank"><fieldset><legend>Title:</legend>
    <input th:field="*{destinationFilterType}" checked="checked" name="Destination" type="radio" value="destinationName" />Destination Name
    <input th:field="*{destinationFilterType}" name="Destination" type="radio" value="destinationCity" />Destination City
    <input th:field="*{destinationFilterType}" name="Destination" type="radio" value="regionId" /> Region Id <br />
    <label for="DestinationInput">Destination</label>
    <input th:field="*{destination}" type="text" value="" /> <br />
    <label for="lengthOfStay">Length Of Stay</label>
    <input th:field="*{lengthOfStay}" type="text"/> <br />
    <label for="MinStartDateInput">Min Start Date</label>
    <input th:field="*{minStartDate}" type="Date" placeholder="yyyy-mm-dd" /> <br />
    <label for="MaxStartDateInput">Max Start Date</label>
    <input th:field="*{maxStartDate}" type="Date" placeholder="yyyy-mm-dd" /> <br/>
    <label for="MinStarRating">Min star rating</label><select th:field="*{minStarRating}">
    <option value="N/A">N/A</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select> <label for="MaxStarRating">MaxStarRating</label><select name="*{maxStarRating}">
    <option value="N/A">N/A</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select><br /> <label for="MinTotalRate">MinTotalRate</label><select th:name="*{minTotalRating}">
    <option value="N/A">N/A</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select><label for="MaxTotalRate">MaxTotalRate</label><select th:name="*{maxTotalRating}">
    <option value="N/A">N/A</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select><br/><label for="MinGuestRating">MinGuestRating</label><select th:name="*{minGuestRating}">
    <option value="N/A">N/A</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select><label for="MaxGuestRating">MaxGuestRating</label><select th:name="*{maxGuestRating}">
    <option value="N/A">N/A</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
</select>
    <input type="submit" value="submit">
</fieldset>
</form>
</html>