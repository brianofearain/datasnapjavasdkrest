package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropCampaign extends Property{

    private String campaignid;
    private String name;
    private PropTags propTags;
 /** private PropSubCampaign subCampaign;
    ],
    "targeting_rules": {
        "Propid": "targetingid",
        "rules": [
            {
                "Propid": "ruleid1",
                "name": "retailandclothingruleforbackofstore",
                "place_ids": [
                    "placeid1"
                ],
                "audience": {
                    "Education": [
                        "NoCollege",
                        "College",
                        "GradSchool"
                    ],
                    "Age": [
                        "18-24",
                        "25-34",
                        "35-44",
                        "45-55",
                        "55+"
                    ],
                    "Ethnicity": [
                        "Caucasian",
                        "AfricanAmerican",
                        "Asian",
                        "Hispanic",
                        "Other"
                    ],
                    "Kids": [
                        "NoKids",
                        "HasKids"
                    ],
                    "Gender": [
                        "Male",
                        "Female"
                    ],
                    "Interests": [
                        "Gettingfromheretothere",
                        "Biking",
                        "Automotive",
                        "Automotive.Cars"
                    ],
                    "Income": [
                        "$0-30k",
                        "$30-60k",
                        "$60-100k",
                        "100k+"
                    ]
                },
                "targeting_attributes": {
                    "store_type": "retail",
                    "product_type": "clothing"
                }
            },
            {
                "Propid": "ruleid2",
                "name": "mycoolrule2",
                "audience": {
                    "Education": [
                        "NoCollege",
                        "College",
                        "GradSchool"
                    ],
                    "Age": [
                        "18-24",
                        "25-34",
                        "35-44",
                        "45-55",
                        "55+"
                    ],
                    "Ethnicity": [
                        "Caucasian",
                        "AfricanAmerican",
                        "Asian",
                        "Hispanic",
                        "Other"
                    ],
                    "Kids": [
                        "NoKids",
                        "HasKids"
                    ],
                    "Gender": [
                        "Male",
                        "Female"
                    ],
                    "Interests": [
                        "Gettingfromheretothere",
                        "Biking",
                        "Automotive",
                        "Automotive.Cars"
                    ],
                    "Income": [
                        "$0-30k",
                        "$30-60k",
                        "$60-100k",
                        "100k+"
                    ]
                }
            }
        ]
    },
    "time_filter": {
        "monday": {
            "start": "08: 00",
            "end": "13: 00"
        },
        "tuesday": {
            "start": "08: 00",
            "end": "22: 00"
        }
    },
    "time_trigger": {
        "monday": "08: 00",
        "tuesday": "13: 00"
    },
    "communication": {
        "Propid": "commid"
    }
} */
	
	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JsonFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
    

}
